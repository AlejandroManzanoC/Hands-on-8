
package grad_des;


public class GradientDescent {

    private double b0, b1, lr;

    public GradientDescent() {
        this.b0=0;
        this.b1=0;
        this.lr=0.003;
    }
    
    public double getB0() {
        return this.b0;
    }
    public double getB1() {
        return this.b1;
    }
    public double getAlpha() {
        return this.lr;
    }
    
    public void setBeta0(double aux) {
        this.b0=aux;
    }
    public void setBeta1(double aux) {
        this.b1=aux;
    }
    public void setA(double aux) {
        this.lr=aux;
    }

    Arithmetic arithmetic= new Arithmetic();
    
    
    public void GradientMethod(){

        double e= arithmetic.Error(getB0(),getB1());

        System.out.println("Error= "+e);

        while(e>0) {
            double alpha, b0aux, b1aux;

            alpha= getAlpha();
            b0aux= alpha* arithmetic.dB0(getB0(),getB1());
            b1aux= alpha* arithmetic.dB1(getB0(),getB1());

            setBeta0(getB0()-b0aux);
            setBeta1(getB1()-b1aux);

            e= arithmetic.Error(getB0(),getB1());

            System.out.println("Error equals "+e);
         }

        System.out.println("Beta0: "+getB0()+"\nBeta1: "+getB1());

    }

}
