class Arrex{

public static void main(String[] args){

//Single array
int arr[] = new int[4];
arr[0] = 1;
arr[1] = 2;
arr[2] = 2;
arr[3] = 5;

for(int i=0; i < arr.length; i++){

System.out.println(arr[i]);
}
System.out.println();
System.out.println("Size of array is "+arr.length);
System.out.println();

//Multidimensional array

int a[][]= new int [2][2];
a[0][0] = 1;
a[0][1] = 2;
a[1][0] = 3;
a[1][1] = 4;


for(int i=0; i<2; i++){
for(int j=0; j<2; j++){
System.out.println(a[i][j]);
}
}

}
}