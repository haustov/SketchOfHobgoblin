package net.haustov.hobgoblin.hobservicetest;

import java.util.List;
import net.haustov.hobgoblin.hobservice.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        testService();
    }

    private static void testService()
    {
        try
        {
            net.haustov.hobgoblin.hobservice.HomeStoreService service =
                    new net.haustov.hobgoblin.hobservice.HomeStoreService();
            net.haustov.hobgoblin.hobservice.HomeStore port =
                    service.getHomeStorePort();
            long result = port.test();
            System.out.println("Result = " + result);
            
            List<Product> resultArr = port.testArray();
            for(Product p: resultArr)
            {
                System.out.println(p.getName() + " " + p.getUnits().getName());
            }
            
        }
        catch (Exception ex)
        {
        }
    }

}
