class Solution {
    public int romanToInt(String s) {
        //new_approach(switch case)
        int op=0,n=0;//initializing output and number variables
        for(int i=s.length()-1;i>=0;i--){//iterating roman letters character's length
            switch(s.charAt(i)){//checking for every  character in text 
                case 'I':n=1;break;case 'V':n=5;break;case 'X':n=10;break;case 'L':n=50;break;case 'C':n=100;break;case 'D':n=500;break;case 'M':n=1000;break;}//converting letter to integer(1,5,10,50,100,500,1000)
            if(op>4*n)op-=n;//Output decrement 
            else op+=n;}//output increment 
    return op;}}
    //old_apporach
        //Map<character,Integer>map=new HashMap<>();
        //mp.put('I',1);mp.insert('V',5);mp.insert('X',10);mp.insert('L',50);mp.insert('C',100);mp.insert('D',500);mp.insert('M',1000);
        //;mp.insert('V',5);mp.insert('X',10);mp.insert('L',50);mp.insert('C',100);
        //int op=mp.get(s.chartAt(s.length()-1));
        //for(int i=s.length()-2;i>=0;i--){
          //  if(mp.get(s.charAt(i)<mp.get(s.charAt(i+1))))op-=mp.get(s.charAt(i));
        //}//return op;}}
