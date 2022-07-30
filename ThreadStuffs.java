import java.lang.reflect.Field;
import java.util.ArrayList;

public class ThreadStuffs {
    public static void main( String[] args )
            throws Exception
    {
        ArrayList al = new ArrayList();          //Size:  0, Capacity:  0
        //ArrayList al = new ArrayList(5);         //Size:  0, Capacity:  5
        //ArrayList al = new ArrayList(new ArrayList(5)); //Size:  0, Capacity:  0
        for(int i = 0; i < 30; i++){
            al.add( "shailesh" );                    //Size:  1, Capacity: 10
            getCapacity( al );
        }
    }

    static void getCapacity( ArrayList<?> l )
            throws Exception
    {
        Field dataField = ArrayList.class.getDeclaredField( "elementData" );
        dataField.setAccessible( true );
        System.out.format( "Size: %2d, Capacity: %2d%n", l.size(), ( (Object[]) dataField.get( l ) ).length );
    }
}
