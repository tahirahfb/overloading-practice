public class Counter {
private int num;

//Constructors
public Counter(int startValue){
    this.num = startValue;
}

public Counter(){
    this.num = 0;
}

//Methods
public int value(){
    return num;
}

public void increase(){
    num += 1;
}

public void increase(int increaseBy){
    if (increaseBy < 0){
        this.num = this.num;
    } else {
        this.num += increaseBy;
    }
}

public void decrease(){
    this.num -= 1;
}

public void decrease(int decreaseBy){
    if (decreaseBy < 0){
        this.num = this.num;
    } else {
        this.num -= decreaseBy;
    } 
}

@Override

public String toString(){
    return "" + value();
}


}
