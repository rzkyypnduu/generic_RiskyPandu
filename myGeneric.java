

public class myGeneric<T> {
    private T data;

    public myGeneric(T data) {
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }


}