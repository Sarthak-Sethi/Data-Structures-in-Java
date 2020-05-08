
package codingninja;

public class Polynomial {    
     int a[]= new int[10];
     public Polynomial add(Polynomial second) 
    {
        Polynomial temp = new Polynomial();
    
      int m= Math.max(this.a.length,second.a.length);
      int ans=0;
      for (int i=0;i<m;i++)
      {
          if(a.length >i && second.a.length>i)// agar degree of both polynomials is big as compaerd to biggest degree
              ans=a[i]+second.a[i];
          else if (a.length>i)
              ans=a[i];
          else if(second.a.length>i)
              ans=second.a[i];
          temp.setCoefficient(i,ans);
      }
      return temp;
    }

  void print() 
    {
        for (int i=0; i<a.length; i++)
        { if(a[i]!=0){
       System.out.print(a[i]+"x"+i+"+");}
        }
    }

    public void setCoefficient(int degree, int cofficent) 
    {
     
        if(degree>a.length-1)
        {
            int temp[]= a; //mve content of a in new array
            a= new int[degree+1]; // re make the array with size of degree
            for (int i=0;i<temp.length;i++)
            { // moving the old elemnts in the new array
                a[i]= temp[i];
            }
        }
        a[degree]=cofficent; 
    }

     public Polynomial subtract(Polynomial second) 
    {
        Polynomial temp = new Polynomial();
    
      int m= Math.max(a.length,second.a.length);
      int ans=0;
      for (int i=0;i<m;i++)
      {
          if(a.length >i && second.a.length>i)// agar degree of both polynomials is big as compaerd to biggest degree
              ans=a[i]-second.a[i];
          else if (a.length>i)
              ans=a[i];
          else if(second.a.length>i)
              ans=second.a[i];
          temp.setCoefficient(i,ans);
      }
      return temp;
    }

   public Polynomial multiply(Polynomial second) 
   {
        Polynomial temp = new Polynomial();
        int temparr[] = new int[a.length+second.a.length];

        for (int i=0;i<a.length+second.a.length-1;i++)
        {
            temparr[i]=0;
        }
        for (int i = 0; i < a.length; i++)  
        { 
            // Multiply the current term of first polynomial 
            // with every term of second polynomial. 
            for (int j = 0; j < second.a.length; j++)  
            { 
                temparr[i + j] += a[i] * second.a[j]; 
            } 
        }
        temp.a = temparr;
    return temp;
    
   }
}
