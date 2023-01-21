public class Calculators {
    private static boolean check = false;
    private static boolean isOpen = false;

    public void open() {
        isOpen = true;
    }

    public boolean indexation(Object num) throws Exception {
        check = true;
        if (!isOpen) throw new Exception("Please call the open method");
        String s = String.valueOf(num);
        if (s.indexOf(".") !=-1) throw new Exception("Error!");

        int m = Integer.parseInt(s);
        for (int i = m/2; i > 1; i--) {
            if(m % i == 0) throw new Exception("Error!");;
        }
        return true;
    }

    public void close() throws Exception {
        if (isOpen) {
            isOpen = false;
        }else{
            throw new Exception("Please call the open method");
        }
    }

    public boolean getCheck(){
        return check;
    }

    public boolean getIsOpen(){
        return isOpen;
    }
}
