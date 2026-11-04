class Solution {
    public int[] asteroidCollision(int[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        int j=0;
        while(j<n&&l[j]<0)
        {
            stack.push(l[j]);
            j++;
        }
        for(int i=j;i<n;i++)
        {
            if(stack.isEmpty()||l[i]>0||stack.peek()<0)
            {
                stack.push(l[i]);
            }
            else if(l[i]<0)
            {
                if(stack.peek()==(-1)*l[i])
                {
                    stack.pop();
                }
                else if(stack.peek()<(-1)*l[i])
                {
                    while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<(-1)*l[i])
                    {
                       stack.pop();
                       if(!stack.isEmpty()&&stack.peek()==(-1)*l[i])
                       {
                            stack.pop();
                            break;
                       }
                       if(stack.isEmpty()||stack.peek()<0)
                        {
                            stack.push(l[i]);
                            break;
                        }
                    }
                }
            }
        }
        int k[]=new int[stack.size()];
        int x=0;
        for(int i:stack)
        {
            k[x]=i;
            x++;
        }
        return k;
    }
}