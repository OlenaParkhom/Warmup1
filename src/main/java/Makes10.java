public class Makes10 {
    public static void main(String[] args) {
        makes10(); //ты стучишься к методу, но не передаешь параметров, а на вход в метод их просишь
        int a = 5;
        int b = 6;
    }

    public boolean makes10(int a, int b){ // сюда
        return (a==10 || b==10 || a+b==10);
    }

    }




