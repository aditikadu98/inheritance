
public class Example_2 {

    public static void main(String args[]) {
        Granddaughter objd = new Granddaughter();
        objd.disp();
        objd.getdata(12, 6);
        objd.adi();
        System.out.println(objd.ani());
    }
}

interface Mother {

    void disp();
    String o="adi";
}

interface Daughter extends Mother {

    void getdata(int q, int w);
    
}

class Granddaughter implements Daughter {

    public void disp() {
        int r = 12;
        int t = 2;
        int y = r - t;
        System.out.println("addition : " + y);
    }

    public void getdata(int q, int w) {
        int e = q / w;
        System.out.println("division : " + e);
    }

    public void adi() {
        System.out.println("ani");
        System.out.println(o);
    }

    public String ani() {
        String v = "adani";
        return v;
    }
   
    
    
}
