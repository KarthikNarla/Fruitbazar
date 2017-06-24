/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karthik-pc
 */
public interface ProductItem {
    public abstract int getPrice();
    
}

abstract class FruitItem implements ProductItem 
{
    
}
class AppleItem extends FruitItem
{

    public int getPrice() 
    {
    return 25; 
    }
    
}
class PomItem extends FruitItem
{

    public int getPrice() 
    {
        return 45;
    }
}
    
    class PineItem extends FruitItem
    {

        public int getPrice() 
        {
        return 30;
        }
        
    }

