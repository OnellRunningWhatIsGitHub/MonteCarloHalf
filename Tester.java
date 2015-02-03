
public class Tester {
static MonteCarlo mcObj = new MonteCarlo(5,3,2);
static int cirCount=0;
static int sqrCount =0;
public static void main(String[] args){
		
		for(int i=0; i<10000000;i++){
			double randx = mcObj.nextRainDrop_x();
			double randy = mcObj.nextRainDrop_y();
			//System.out.println(randx);
			if(mcObj.insideCirle(randx, randy)){
				cirCount++;
				
			}
			sqrCount++;
		}
	
		System.out.println("Pi is estimated at:  "+ cirCount*Math.pow(2*mcObj.r,2)/(sqrCount*Math.pow(mcObj.r, 2)));
	}
	
}
