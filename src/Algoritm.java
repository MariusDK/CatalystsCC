import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MariusDK on 07.04.2017.
 */
public class Algoritm {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int deltaY(Matrice m)
    {
        int deltaY=0;
        int firstLine=0;
        for (int i=0;i<m.getNrOfRows();i++)
        {
            for (int j=0;j<m.getNrOfColumns();j++)
            {
                if (m.getA()[i][j]!=0)
                {
                    firstLine=i;
                    break;
                }

            }
            if (firstLine!=0)
            {
                break;
            }

        }
        setY(firstLine-1);
        int lastLine=0;
        for (int i=m.getNrOfRows()-1;i>=0;i--)
        {
            for (int j=m.getNrOfColumns()-1;j>=0;j--)
            {
                if (m.getA()[i][j]!=0)
                {
                    lastLine=i;
                    break;
                }

            }
            if (lastLine!=0)
            {
                break;
            }


        }
        deltaY=lastLine-firstLine+2;
        return deltaY;

    }
    public int deltaX(Matrice m)
    {
        int deltaX=0;
        int firstColumm=0;
        for (int i=0;i<m.getNrOfColumns();i++)
        {
            for (int j=0;j<m.getNrOfRows();j++)
            {

                if (m.getA()[j][i]!=0)
                {
                    firstColumm=i;
                    break;
                }

            }
            if (firstColumm!=0)
            {
                break;
            }

        }
        setX(firstColumm-1);
        int lastColumm=0;
        for (int i=m.getNrOfColumns()-1;i>=0;i--)
        {
            for (int j=m.getNrOfRows()-1;j>=0;j--)
            {
                if (m.getA()[j][i]!=0)
                {
                    lastColumm=i;
                    break;
                }

            }
            if (lastColumm!=0)
            {
                break;
            }

        }
        deltaX=lastColumm-firstColumm+2;
        return deltaX;
        ///
    }
    public int deltaY(Matrice m,int val)
    {
        int deltaY=0;
        int firstLine=0;
        for (int i=0;i<m.getNrOfRows();i++)
        {
            for (int j=0;j<m.getNrOfColumns();j++)
            {
                if (m.getA()[i][j]==val)
                {
                    firstLine=i;
                    break;
                }

            }
            if (firstLine!=0)
            {
                break;
            }

        }
        setY(firstLine-1);
        int lastLine=0;
        for (int i=m.getNrOfRows()-1;i>=0;i--)
        {
            for (int j=m.getNrOfColumns()-1;j>=0;j--)
            {
                if (m.getA()[i][j]==val)
                {
                    lastLine=i;
                    break;
                }

            }
            if (lastLine!=0)
            {
                break;
            }


        }
        deltaY=lastLine-firstLine+2;
        return deltaY;

    }
    public int deltaX(Matrice m,int val)
    {
        int deltaX=0;
        int firstColumm=0;
        for (int i=0;i<m.getNrOfColumns();i++)
        {
            for (int j=0;j<m.getNrOfRows();j++)
            {

                if (m.getA()[j][i]==val)
                {
                    firstColumm=i;
                    break;
                }

            }
            if (firstColumm!=0)
            {
                break;
            }

        }
        setX(firstColumm-1);
        int lastColumm=0;
        for (int i=m.getNrOfColumns()-1;i>=0;i--)
        {
            for (int j=m.getNrOfRows()-1;j>=0;j--)
            {
                if (m.getA()[j][i]==val)
                {
                    lastColumm=i;
                    break;
                }

            }
            if (lastColumm!=0)
            {
                break;
            }

        }
        deltaX=lastColumm-firstColumm+2;
        return deltaX;
        ///
    }
    public int[] detectareLuminozitate(HashMap<Integer,Integer> k, Matrice m)
    {
        int l=1;
        Integer curr=k.remove(l);
        while(!k.isEmpty())
        {
            l++;
            int curr2=k.remove(l);
            if (curr<curr2)
            {
                if ((deltaX(m,curr)==deltaX(m,curr2))&&(deltaY(m,curr)==deltaY(m,curr2)))
                {
                    return convert(m,curr,curr2);
                }
            }
        }
        return convert0(m,curr,curr);
    }
    public int[] convert(Matrice m,int val1,int val2)
    {
        int[] a=new int[m.getNrOfRows()*m.getNrOfColumns()];
        int k=0;
        for (int i=0;i<m.getNrOfRows();i++)
        {
            for (int j=0;j<m.getNrOfColumns();j++)
            {
                if ((m.getA()[i][j]==val1)||(m.getA()[i][j]==val2))
                {
                    a[k]=1;


                }
                else a[k]=0;

                k++;
            }
        }
        return a;
    }
    public int[] convert0(Matrice m,int val1,int val2)
    {
        int[] a=new int[m.getNrOfColumns()*m.getNrOfRows()];
        int k=0;
        for (int i=0;i<m.getNrOfRows();i++)
        {
            for (int j=0;j<m.getNrOfColumns();j++)
            {
                if ((m.getA()[i][j]==val1)||(m.getA()[i][j]==val2))
                {
                    a[k]=0;


                }
                else {a[k]=0;}

                k++;
            }
        }
        return a;
    }
}
