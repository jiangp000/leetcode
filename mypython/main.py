class Solution:
    def queensAttacktheKing(self, queens: List[List[int]], king: List[int]) -> List[List[int]]:
        res = []
        data =[[0 for i in range(8)]for j in range(8)]
        for i in queens:
            data[i[0]][i[1]] = 1
        kingX, kingY = king[0], king[1]
        for i in range(kingX - 1, - 1, -1):
            if data[i][kingY] == 1:
                res.append([i, kingY])
                break
        for i in range(kingX + 1, 8):
            if data[i][kingY] == 1:
                res.append([i, kingY])
                break
        for i in range(kingY - 1, - 1, -1):
            if data[kingX][i] == 1:
                res.append([kingX, i])
                break
        for i in range(kingY + 1, 8):
            if data[kingX][i] == 1:
                res.append([kingX, i])
                break                              
        for k, m in zip(range(kingX - 1, -1, -1), range(kingY-1, -1, -1)):  
            if data[k][m] == 1:  
                temp = [k, m]  
                res.append(temp)  
                break
        for k, m in zip(range(kingX - 1, -1, -1), range(kingY + 1, 8)):  
            if data[k][m] == 1:  
                temp = [k, m]  
                res.append(temp)  
                break
        for k, m in zip(range(kingX + 1, 8), range(kingY - 1, -1, -1)):  
            if data[k][m] == 1:  
                temp = [k, m]  
                res.append(temp)  
                break
        for k, m in zip(range(kingX + 1, 8), range(kingY + 1, 8)):  
            if data[k][m] == 1:  
                temp = [k, m]  
                res.append(temp)  
                break
        return res
