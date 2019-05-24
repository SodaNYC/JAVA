public class HW4_2_1 {
private String first_name;
private String last_name;
private int zip_code;

HW4_2_1(){
}

HW4_2_1(String fn,String ln, int zc){
first_name = fn;
last_name = ln;
zip_code = zc;
}

public String getfn(){
return first_name;
}

public String getln(){
return last_name;
}

public int getzc(){
return zip_code;
}
}
