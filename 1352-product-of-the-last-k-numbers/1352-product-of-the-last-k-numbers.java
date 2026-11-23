class ProductOfNumbers {
    ArrayList<Integer>l=new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int n) {
        l.add(n);
    }
    
    public int getProduct(int k) {
        int x=0;
        int pro=1;
        int v=l.size()-1;
        while(x!=k)
        {
            pro=pro*l.get(v);
            v--;
            x++;
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */