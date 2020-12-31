import javax.swing.ImageIcon;

public class Calendar {
	private int month;
	
	private ImageIcon monthImage;
	
	public Calendar(int month) {
		this.month = month;
		String imgFolder = "src/calendarImages/";
		switch (month) { 
        case 1: 
        	monthImage = new ImageIcon(imgFolder + "jan.png"); 
            break; 
        case 2: 
        	monthImage = new ImageIcon(imgFolder + "feb.png");  
            break; 
        case 3: 
        	monthImage = new ImageIcon(imgFolder + "mar.png");  
            break; 
        case 4: 
        	monthImage = new ImageIcon(imgFolder + "apr.png");  
            break; 
        case 5: 
        	monthImage = new ImageIcon(imgFolder + "may.png");  
            break; 
        case 6: 
        	monthImage = new ImageIcon(imgFolder + "jun.png");  
            break; 
        case 7: 
        	monthImage = new ImageIcon(imgFolder + "jul.png");  
            break; 
        case 8: 
        	monthImage = new ImageIcon(imgFolder + "aug.png"); 
            break; 
        case 9: 
        	monthImage = new ImageIcon(imgFolder + "sep.png");  
            break; 
        case 10: 
        	monthImage = new ImageIcon(imgFolder + "oct.png");  
            break; 
        case 11: 
        	monthImage = new ImageIcon(imgFolder + "nov.png");  
            break; 
        case 12: 
			monthImage = new ImageIcon(imgFolder + "dec.png");  
            break;  
        default:   
            break;
		}
	}
	
	public ImageIcon getImage() {
		return monthImage;
	}
	
	public int getMonth() {
		return month;
	}

}
