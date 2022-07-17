import ru.netology.sqr.SQRService;

public class Main {

    public static void  main(String[] args) {

        SQRService service = new SQRService();
        int result = service.myCount(200, 700);
        System.out.println(result);
    }
}
