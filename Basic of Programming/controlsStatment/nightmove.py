from itertools import product
def knight_moves(position):
    x, y = position
    print(list(product([x-1, x+1],[y-2, y+2])))
    print(list(product([x-2,x+2],[y-1,y+1])))
    moves = list(product([x-1, x+1],[y-2, y+2])) + list(product([x-2,x+2],[y-1,y+1]))
    print(moves)
    moves = [(x,y) for x,y in moves if x >= 1 and y >= 1 and x <=8 and y <= 8]
    print(moves)
    return len(moves)

print(knight_moves((1,1)))