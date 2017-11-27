import config.DataConfig;
import dao.LotDao;
import dao.UserDao;
import entities.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DataConfig.class);


        UserDao user=context.getBean(UserDao.class);
        //System.out.println(user.findAll());


    }
}
