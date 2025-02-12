public class Logic {

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
        for (char c : text.toCharArray()) {
            try {
                System.out.println();
                Method method = this.getClass().getMethod(String.valueOf(c));
                method.invoke(this);
                System.out.println();
            } catch (Exception e) {
                System.out.println();
                Space();
                System.out.println();
            }
        }
    }



    public  void Space()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }


    public void A()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                //(j==0 && i ==size/2)
                if((j==0 && i==0) || ( i==0 && j==size-1) )
                {
                    System.out.print(" ");
                }
                else if((j==0) || (j==size-1) || (i==0) || (i==size/2))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.print("\n");
        }
    }

    public void B()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==0&& j==size-1) || (i==size/2&& j==size-1) ||(i==size-1&& j==size-1) )
                {
                    System.out.print(" ");
                }
                else if( (i==0) || (i==size/2)||(i==size-1)||(j==0) || (j==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void C()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==0&& j==0) || (i==size-1&& j==0)  )
                {
                    System.out.print(" ");
                }
                else if( (i==0) || (i==size-1)||(j==0))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void D()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==size-1&& j==size-1) || (i==0&& j==size-1))
                {
                    System.out.print(" ");
                }
                else if( (i==0) || (i==size-1)||(j==0) || (j==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void E()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if( (i==0) || (i==size/2)||(i==size-1)||(j==0))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void F()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if( (i==0) || (i==size/2)||(j==0))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void G()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i<size/2 && j==size-1) || (i==0&& j==0) || (i==size-1&& j==0) ||(i==size-1&& j==size-1) || (i==size/2&& j==size-1) || ((i==size/2)&& (j<size/2)&&(j>=1)) )
                {
                    System.out.print(" ");
                }
                else if((i==0)||(i==size/2)||(j==0) || (i==size-1) || (j==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void H()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (j==size-1) || (i==size/2))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void I()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==size/2) || (i==0) || (i==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void J()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==size/2) || (i==0) || (i==size-1 &&  j<size/2) || (j==0 && i>((size*.65))))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void K()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (i+j==size/2+1) || ((i-j==(size/2)-1)&&(i>=(size/2+1))))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void L()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==size-1)||(j==0))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }





    public void temp()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {

                    System.out.print(i+""+j+" ");
            }
            System.out.print("\n");
        }
    }

    public void M()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (j==size-1) || (((i==j) || j+i==size-1)&&i<=(size/2)))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void N()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (j==size-1) || (i==j))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }


    public void O()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (j==size-1) || (i==0) || (i==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void P()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                //(j==0 && i ==size/2)
                if(( i==0 && j==size-1) || ((j==size-1)&&(i==size/2)))
                {
                    System.out.print(" ");
                }
                else if((j==0) || (j==size-1) &&(i<=size/2) || (i==0) || (i==size/2))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.print("\n");
        }
    }

    public void Q()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                //(j==0 && i ==size/2)
                if((j==0 && i==0) || ( i==0 && j==size-1) ||(j==0 || j==size-1)&&(i>(int)(size*0.7)-1) )
                {
                    System.out.print(" ");
                }
                else if((j==0) || (j==size-1) || (i==0) || (i==(int)(size*0.7))|| (i-j==1 && (i>(size*0.5))))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void R()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                //(j==0 && i ==size/2)
                if(( i==0 && j==size-1) || ((j==size-1)&&(i==size/2)))
                {
                    System.out.print(" ");
                }
                else if((j==0) || (j==size-1) &&(i<=size/2) || (i==0) || (i==size/2) ||((i==j)&&i>size/2))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.print("\n");
        }
    }

    public void S()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==0 && j==0) || (i==size/2 && j==size-1 || (i==size-1 && j==size-1)))
                {
                    System.out.print(" ");
                }
                else if( (i==0) || (i==size/2)||(i==size-1)||(j==0 && i<size/2) || (j==size-1 && i>size/2))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void T()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==size/2) || (i==0))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }


    public void U()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==size-1 && j==0) || (i==size-1 && j==size-1))
                {
                    System.out.print(" ");
                }
                else if((j==0) || (j==size-1)|| (i==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void V()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((((j==0 ||j==size-1) && i<size/2)) ||(((i-j==size/2 ||i+j==(size/2)*3 && i>size/2-1))))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void W()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((j==0) || (j==size-1) || (((i==j) || j+i==size-1)&&i>=(size/2)))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void X()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((i==j) || j+i==size-1)
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void Y()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if((((i==j) || j+i==size-1) &&(i<=size/2)) ||((i>size/2)&&(j==size/2)))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void Z()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if( (i==0)||(i==size-1) ||(i+j==size-1))
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }




}
