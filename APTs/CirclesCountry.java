public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {

        int crossings = 0;
        for (int i = 0; i < x.length; i++) {
            if(inside(x1, y1, x[i], y[i], r[i]) ^ inside(x2, y2, x[i], y[i], r[i])){
                crossings += 1;
            }
        }
        return crossings;
    }
    private boolean inside(int x1, int y1, int cx, int cy, int radius){
        double distance = Math.sqrt(Math.pow(x1-cx, 2) + Math.pow(y1-cy, 2));
        return distance < radius;
    }

}

