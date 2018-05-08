import java.util.Arrays;

public class Methods {

    static final int size = 1000000;
    static final int h = size / 2;


    public void method1() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
                arr[i]= 1;
            }
        //System.out.println(Arrays.toString(arr));
            long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1){
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));}
            }
            //System.out.println(Arrays.toString(arr));
            System.out.println(System.currentTimeMillis()-a);
    }


    public void method2() {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));

        Thread t1 = new Thread(()-> {
            for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(Arrays.toString(a1));

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(Arrays.toString(a2));

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis()- a);
        //System.out.println(Arrays.toString(arr));
    }
}
