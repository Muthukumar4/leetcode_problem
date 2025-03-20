class Solution {
    public int calPoints(String[] str) {
         int sum , sum1 ;
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : str) {
            if (isNumeric(s)) {
                list.add(Integer.parseInt(s));
            } else if (s.contains("C")) {
                if(!list.isEmpty()){
                list.removeLast();
                }
            } else if (s.contains("+")) {
               sum= list.get(list.size()-1);
               int sum2= list.get(list.size()-2);
                list.add(sum+sum2);
            } else if (s.contains("D")) {
                sum1=list.getLast();
                int sum2 = sum1 * 2;
                list.add(sum2);
            }

        }
        System.out.println(list);
        int val=0;
        for (int var:list){

             val+=var;
        }
        System.out.println(val);
        return val;
    }
    
        static boolean isNumeric (String str){
        boolean number=false;
        number=isNegative(str);
        if(Character.isDigit(str.charAt(0)) && number==false) {
            number = true;
        }

        return number;
        }
        static boolean isNegative(String str){
        if(str.charAt(0)=='-'){
            return str.length() >1 && Character.isDigit(str.charAt(1));
        }
        return false;
        }

    }
