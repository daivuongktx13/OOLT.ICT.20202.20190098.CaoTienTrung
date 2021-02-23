#include<iostream>
using namespace std;



int n;
int k1;
int x[10000];
int mark[1000000000];
int count=0;


int check(int v, int k){
if(mark[v]) return 0;
return 1;
}



void solution(){
for(int i = 1; i <= n; i++) {
	cout << x[i];
	cout << " ";
}
cout << endl;
}



void Try(int k){
for(int v = 1; v <= n; v++){
if(check(v, k)){
x[k] = v;
mark[v] = 1;
if(k == n) {
	count+=1;
	if(count==k1) {
		solution();
			exit(0);
	}
}
else Try(k + 1);
mark[v] = 0;
}
}
}



int main (){
cin >> n;
cin >> k1;
Try(1);
if(k1>count) cout<<-1;
}
