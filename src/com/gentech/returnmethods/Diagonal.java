package com.gentech.returnmethods;

class Diagonalele
{
	short[][] print(short x[][])
	{
		short res[][]=new short[x.length][x[0].length];
		int k=0,z=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(i==j)
				{
					res[k][z]=x[i][j];
					k++;
					z++;
				}
			}
		}
		return res;
	}
}
public class Diagonal {

	public static void main(String[] args) {
		Diagonalele d=new Diagonalele();
		short res[][]= {{1,2,3},{4,5,6},{7,8,9}};
		short finl[][]=d.print(res);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				if(finl[i][j]!=0)
				{
					System.out.print(finl[i][j]+" ");
				}
			}
		}

	}

}
