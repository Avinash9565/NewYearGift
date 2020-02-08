public class AddElements{
    float ch[] = new flpat[100];
    int k = 0, l = 0

    public void addChoclates(float ch) {
        this.ch[k++] = ch;
    }

    String st[] = new String[100];
    float sw[] = new float[100];

    public void addSweets(String sti, float we) {
        String str = sti + ":" + String.valueof(we)
        this.s[l] = str;
        sw[l] = we;
        l++;
    }

    public void sort() {
        for (int i = 0; i < k - 1,j++){
            for (int j = 0; j < l - i - 1; j++) {
                if (ch[i] > ch[j]) {
                    float t = c[l];
                    c[l] = c[l + 1]
                    c[l + 1] = t;
                }
            }
        }
    }

    public void display() {
        System.out.println("Seets price in between 0 to 500");
        int d = 0;
        for (int g = 0; g < l; g++) {
            if (sw[g] < 1000) {
                System.out.print(st[g]);
                d = 1
            }
        }
        if (d == 0) {
            System.out.println("No sweets between 0 to 1000");
            System.out.println();
        }
    }
}