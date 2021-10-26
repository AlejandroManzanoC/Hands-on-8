
package grad_des;


public class Data {
    
    private final int num;
    private double[] x, y;
    
    public Data(){
        this.num=9;
        this.x= new double[]{23,26,30,34,43,48,52,57,58};
        this.y= new double[]{651,762,856,1063,1190,1298,1421,1440,1518};
    }
    
    public int getN() {
        return num;
    }
    public double[]getX() {
        return this.x;
    }
    public double[]getY() {
        return this.y;
    }
    
    public void setN() {
    }
    public void setX(double[]aux) {
        this.x=aux;
    }
    public void setY(double[]aux) {
        this.y=aux;
    }
    
}
