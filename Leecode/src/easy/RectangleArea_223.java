package easy;

public class RectangleArea_223 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area=0;
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
        area=area1+area2;
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);

        int overlap = 0;
        if(right > left && top > bottom)
             overlap = (right - left) * (top - bottom);
        return area-overlap;
    }
}
