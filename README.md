# DSA-Problems
Knapsack is the problem I got in 'The Deloitte hacksplosion 2026'. which is solved using dynamic programming.
dp[i] stores the minimum number of bottles required to make volume i.

Initialize all entries with Integer.MAX_VALUE (acts like infinity).

dp[0] = 0 (base case).

For each volume from 1 to target, try all bottle sizes.

Time Complexity: O(target × number_of_bottles)

Space Complexity: O(n)
