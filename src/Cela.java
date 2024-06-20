
public class Cela {
    private String cell;
    private boolean isOpen;
    private int PIN;
    
    public Cela(String cell, boolean isOpen)
    {
        this.cell = cell;
        this.isOpen = isOpen;
        PIN = 1234;
    }
    
    public String getCell()
    {
        return cell;
    }
   
    
    public boolean getIsOpen()
    {
        return isOpen;
    }
    
    
    public void setCell(String cell)
    {
        this.cell = cell;
    }
    
    public void setIsOpen(boolean isOpen, int senha)
    {
        this.isOpen = isOpen;
        
        if(PIN == senha)
        {
            System.out.println("Código correto");
            isOpen = !isOpen;
        }
        else
        {
            System.out.println("Código incorreto");
        }
       
        if(isOpen == true)
        {
            System.out.println("Porta aberta");
        }
        else
        {
            System.out.println("Porta fechada");
        }
   
    }
}
