## 2020-08-15 0546 移除盒子


<p>给出一些不同颜色的盒子，盒子的颜色由数字表示，即不同的数字表示不同的颜色。<br>
你将经过若干轮操作去去掉盒子，直到所有的盒子都去掉为止。每一轮你可以移除具有相同颜色的连续 k 个盒子（k&nbsp;&gt;= 1），这样一轮之后你将得到 <code>k*k</code> 个积分。<br>
当你将所有盒子都去掉之后，求你能获得的最大积分和。</p>

<p>&nbsp;</p>

<p><strong>示例：</strong></p>

<pre><strong>输入：</strong>boxes = [1,3,2,2,2,3,4,3,1]
<strong>输出：</strong>23
<strong>解释：</strong>
[1, 3, 2, 2, 2, 3, 4, 3, 1] 
----&gt; [1, 3, 3, 4, 3, 1] (3*3=9 分) 
----&gt; [1, 3, 3, 3, 1] (1*1=1 分) 
----&gt; [1, 1] (3*3=9 分) 
----&gt; [] (2*2=4 分)
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= boxes.length &lt;= 100</code></li>
	<li><code>1 &lt;= boxes[i]&nbsp;&lt;= 100</code></li>
</ul>
<div><div>Related Topics</div><div><li>深度优先搜索</li><li>动态规划</li></div></div>\n<div><li>👍 166</li><li>👎 0</li></div>

