class Solution {
    public int calPoints(String[] str) {
         int sum , sum1 ;
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : str) {
            switch (s){
                case "+":
                    sum= list.get(list.size()-1);
                    int sum2= list.get(list.size()-2);
                    list.add(sum+sum2);
                    break;
                case "C":
                    if(!list.isEmpty()){
                        list.removeLast();
                    }
                    break;
                case "D":
                    sum1=list.getLast();
                    int sum3 = sum1 * 2;
                    list.add(sum3);
                    break;
                default:
                    list.add(Integer.parseInt(s));
                    break;
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

    }
