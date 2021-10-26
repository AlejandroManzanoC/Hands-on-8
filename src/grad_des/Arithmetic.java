
package grad_des;


public class Arithmetic implements ArithmeticVar {
    
    public Arithmetic() {
    }
    
    Data data= new Data();
    
    @Override
    public double Error(double b0, double b1){
        double resError=0;
        
        double[] auxX=data.getX();
        double[] auxY=data.getY();
        int n=data.getN();
        
        for(int i=0; i<data.getN(); i++){
            resError= Math.sqrt(auxY[i]-b0-(b1*auxX[i]));
        }
        
        resError= resError/n;
        
        return resError;
    } 
    
    
    @Override
    //Derivation B0
    public double dB0(double b0, double b1) {
        double resDB0=0;
        
        double[] auxX=data.getX();
        double[] auxY=data.getY();
        int n=data.getN();
        
        for(int i=0; i<data.getN(); i++) {
            resDB0= auxY[i]-b0-(b1*auxX[i]);
        }
        
        resDB0= -2*resDB0;
        resDB0= resDB0/n;
        
        return resDB0;
    }
    
    
    @Override
    //Derivation B1
    public double dB1(double b0, double b1) {
        double resDB1=0;
        
        double[] auxX=data.getX();
        double[] auxY=data.getY();
        int n=data.getN();
        
        for(int i=0; i<data.getN(); i++){
            resDB1= auxX[i]*(auxY[i]-b0-(b1*auxX[i]));
        }
        
        resDB1= -2*resDB1;
        resDB1= resDB1/n;
        
        return resDB1;
    }
    
}
