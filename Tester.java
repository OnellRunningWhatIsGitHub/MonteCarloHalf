public class tester{

    public static void main(String args[]){
        int cirCount = 0;
        int sqrCount = 0;
        MonteCarlo mcObj = new MonteCarlo(5,3,2);
        for(int i = 0; i<1000000; i++){
            double randx = mcObj.nextRain_Drop_x();
            double randy = mcObj.nextRain_Drop_y();
            //System.out.println(mcObj.insideCircle(randx,randy));
            //don't need it'll be in the square
             /*if((randx<0)&&(randx>2*mcObj.r)&&(randy<0)&&(randy>2*mcObj.r)){
                System.out.println("You have terrible aim! Try hitting the square next time!");
                sqrCount--;
            }
            else*/
            if(mcObj.insideCircle(randx, randy))
            {
                cirCount++;

            }
            sqrCount++;
        }
        //System.out.println(cirCount);
        //System.out.println(sqrCount);
        System.out.println("Pi is approx. "+ cirCount*Math.pow(2*mcObj.r,2)/(sqrCount*Math.pow(mcObj.r, 2)));
    }
}