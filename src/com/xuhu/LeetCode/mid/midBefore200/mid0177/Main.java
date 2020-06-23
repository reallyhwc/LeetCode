package com.xuhu.LeetCode.mid.midBefore200.mid0177;

public class Main {
    /**
     * sql：
     *
     *
     * @param args
     */
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println();
    }
}
/*

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from employee order by salary desc limit N,1
  );
END

 */