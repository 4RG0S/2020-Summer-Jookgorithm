package Baekjoon.solve_05000;

import java.io.*;

public class Baekjoon5639 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		BinaryTree tree = new BinaryTree(Integer.parseInt(s));
		while((s = br.readLine()) != null && s.length() != 0) {
			tree = tree.add(tree, Integer.parseInt(s));
		}
		postOrder(tree);
	}
	
	public static void postOrder(BinaryTree tree) {
		if(tree.left != null) postOrder(tree.left);
		if(tree.right != null) postOrder(tree.right);
		System.out.println(tree.data);
	}
}

class BinaryTree{
	int data;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int data) {
		this.data = data;
	}
	
	public BinaryTree add(BinaryTree tree, int data) {
		if(tree == null) return new BinaryTree(data);
		if(tree.data > data) {
			tree.left = add(tree.left, data);
		}else {
			tree.right = add(tree.right,data);
		}
		return tree;
	}
}