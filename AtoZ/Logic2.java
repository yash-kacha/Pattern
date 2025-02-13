import java.lang.reflect.Method;

public class Logic2 {

    private int size;
    private char ch;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void logicOp(String text) {
        String[] words = text.split(" ");

        String[] temp2;
        for (int i = 0; i < words.length; i++) {
            for (int x = 0; x < size; x++) {
                String tempp = "";
                for (int j = 0; j < words[i].length(); j++) {
                    temp2 = getArray(words[i].charAt(j));
                    tempp += temp2[x] + "   ";
                }
                System.out.println(tempp);
            }

            System.out.println("\n\n");


        }
    }


    public String[] getArray(char i) {
        return switch (i) {
            case 'A' -> A();
            case 'B' -> B();
            case 'C' -> C();
            case 'D' -> D();
            case 'E' -> E();
            case 'F' -> F();
            case 'G' -> G();
            case 'H' -> H();
            case 'I' -> I();
            case 'J' -> J();
            case 'K' -> K();
            case 'L' -> L();
            case 'M' -> M();
            case 'N' -> N();
            case 'O' -> O();
            case 'P' -> P();
            case 'Q' -> Q();
            case 'R' -> R();
            case 'S' -> S();
            case 'T' -> T();
            case 'U' -> U();
            case 'V' -> V();
            case 'W' -> W();
            case 'X' -> X();
            case 'Y' -> Y();
            case 'Z' -> Z();
            case '1' -> one();
            case '2' -> two();
            case '3' -> three();
            case '4' -> four();
            case '5' -> five();
            case '6' -> six();
            case '7' -> seven();
            case '8' -> eight();
            case '9' -> nine();
            case '0' -> zero();

            default -> {
                System.out.println("Invalid character: ");
                yield Space();
            }
        };
    }

    public String[] Space() {

        String[] ans = {"\n"};
        return ans;
    }


    public String[] A() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                //(j==0 && i ==size/2)
                if ((j == 0 && i == 0) || (i == 0 && j == size - 1)) {
                    temp1 += " ";
                } else if ((j == 0) || (j == size - 1) || (i == 0) || (i == size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] B() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == size - 1) || (i == size / 2 && j == size - 1) || (i == size - 1 && j == size - 1)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] C() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == 0) || (i == size - 1 && j == 0)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size - 1) || (j == 0)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] D() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == size - 1 && j == size - 1) || (i == 0 && j == size - 1)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size - 1) || (j == 0) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] E() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] F() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0) || (i == size / 2) || (j == 0)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] G() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i < size / 2 && j == size - 1) || (i == 0 && j == 0) || (i == size - 1 && j == 0) || (i == size - 1 && j == size - 1) || (i == size / 2 && j == size - 1) || ((i == size / 2) && (j < size / 2) && (j >= 1))) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size / 2) || (j == 0) || (i == size - 1) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] H() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (j == size - 1) || (i == size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] I() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == size / 2) || (i == 0) || (i == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] J() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == size / 2) || (i == 0) || (i == size - 1 && j < size / 2) || (j == 0 && i > ((size * .65)))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] K() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (i + j == size / 2 + 1) || ((i - j == (size / 2) - 1) && (i >= (size / 2 + 1)))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] L() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == size - 1) || (j == 0)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }


    public String[] temp() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                System.out.print(i + "" + j + " ");
            }
            System.out.println();
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] M() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (j == size - 1) || (((i == j) || j + i == size - 1) && i <= (size / 2))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] N() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (j == size - 1) || (i == j)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }


    public String[] O() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (j == size - 1) || (i == 0) || (i == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] P() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                //(j==0 && i ==size/2)
                if ((i == 0 && j == size - 1) || ((j == size - 1) && (i == size / 2))) {
                    temp1 += " ";
                } else if ((j == 0) || (j == size - 1) && (i <= size / 2) || (i == 0) || (i == size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }


            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] Q() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                //(j==0 && i ==size/2)
                if ((j == 0 && i == 0) || (i == 0 && j == size - 1) || (j == 0 || j == size - 1) && (i > (int) (size * 0.7) - 1)) {
                    temp1 += " ";
                } else if ((j == 0) || (j == size - 1) || (i == 0) || (i == (int) (size * 0.7)) || (i - j == 1 && (i > (size * 0.5)))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] R() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                //(j==0 && i ==size/2)
                if ((i == 0 && j == size - 1) || ((j == size - 1) && (i == size / 2))) {
                    temp1 += " ";
                } else if ((j == 0) || (j == size - 1) && (i <= size / 2) || (i == 0) || (i == size / 2) || ((i == j) && i > size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }


            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] S() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == 0) || (i == size / 2 && j == size - 1) || (i == size - 1 && j == size - 1) || (i == size / 2 && j == 0)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0 && i < size / 2) || (j == size - 1 && i > size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] T() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == size / 2) || (i == 0)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }


    public String[] U() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == size - 1 && j == 0) || (i == size - 1 && j == size - 1)) {
                    temp1 += " ";
                } else if ((j == 0) || (j == size - 1) || (i == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] V() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((((j == 0 || j == size - 1) && i < size / 2)) || (((i - j == size / 2 || i + j == (size / 2) * 3 && i > size / 2 - 1)))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] W() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (j == size - 1) || (((i == j) || j + i == size - 1) && i >= (size / 2))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] X() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == j) || j + i == size - 1) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] Y() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((((i == j) || j + i == size - 1) && (i <= size / 2)) || ((i > size / 2) && (j == size / 2))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] Z() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((i == 0) || (i == size - 1) || (i + j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] one() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if ((j == size / 2) || (i == size - 1) || (i + j == size / 2 && i < size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] two() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0 && i > size / 2) || (j == size - 1 && i < size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] three() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {
                if((i==0 && j==size-1)||(i==size/2 && j==size-1) || (i==size-1 && j==size-1))
                {
                    temp1 += " ";
                }
                else if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] four() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((j == 0 && i < size / 2) || (i == size / 2) || (j == (int) (size * .7))) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] five() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0 && i < size / 2) || (j == size - 1 && i > size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] six() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {


                if ((i == 0 && j == 0) || (i == size / 2 && j == size - 1) || (i == size - 1 && j == size - 1) ||(i==size-1 && j==0)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0) || (j == size - 1 && i > size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }


            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] seven() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i == 0) || (i + j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] eight() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i == 0 && j == 0) || (i == 0 && j == size - 1)|| (i == size / 2 && j == size - 1) || (i == size / 2 && j == 0) || (i == size - 1 && j == size - 1) ||(i==size-1 && j==0)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size / 2) || (i == size - 1) || (j == 0) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }

            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] nine() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i==0 &&j==0)||(i == 0 && j == size - 1) || ((j == 0) && (i == size / 2))) {
                    temp1 += " ";
            }else if ((j == size-1) || (j == 0) && (i <= size / 2) || (i == 0) || (i == size / 2)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }

    public String[] zero() {
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            String temp1 = "";
            for (int j = 0; j < size; j++) {

                if ((i == 0 && j == 0)||(i == size - 1 && j == size - 1) || (i == 0 && j == size - 1) || (i == size-1 && j == 0)) {
                    temp1 += " ";
                } else if ((i == 0) || (i == size - 1) || (j == 0) || (j == size - 1)) {
                    temp1 += ch;
                } else {
                    temp1 += " ";
                }
            }
            ans[i] = temp1;
        }
        return ans;
    }
}
