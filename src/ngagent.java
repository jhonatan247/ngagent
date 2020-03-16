public class ngagent {
    //atributes
    int bottom;
    int num;
    int top;
    String state = "started";
    public void ngagent(){

    }
    public int compute(char action){
        if(action=='s') {
            this.state = "computing";
            this.bottom = 0;
            this.num = 50;
            this.top = 100;
        }else if(this.state.equals("computing")){
            switch (action){
                case '<':
                    this.top = num;
                    this.num = (this.bottom+this.top)/2;
                    break;
                case '>':
                    this.bottom = num;
                    this.num = (this.bottom+this.top)/2;
                    break;
                case '=':
                    this.state = "done";
                default:
                    System.out.println("no operation");
                    break;
            }
        }else if(this.state.equals("done")){
            System.out.println("the number is " + this.num);
        }else{
            System.out.println("no operation");
        }
        return num;
    }
}
