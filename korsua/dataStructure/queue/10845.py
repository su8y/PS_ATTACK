from sys import stdin

input = stdin.readline

n = int(input())


class MyQueue:
    def __init__(self):
        self.head = -1
        self.tail = -1
        self.q = []

    def pop(self):
        if self.head == self.tail:
            print(-1)
        else:
            print(self.q[self.head + 1])
            self.head += 1

    def size(self):
        print(self.tail - self.head)

    def empty(self):
        if self.head == self.tail:
            print(1)
        else:
            print(0)

    def front(self):
        if self.head == self.tail:
            print(-1)
        else:
            print(self.q[self.head + 1])

    def back(self):
        if self.head == self.tail:
            print(-1)
        else:
            print(self.q[self.tail])

    def push(self, x):
        self.q.append(x)
        self.tail += 1


m_q = MyQueue()
for e in range(n):
    cmd = list(input().split())
    if cmd[0] == 'push':
        m_q.push(cmd[1])
    elif cmd[0] == 'pop':
        m_q.pop()
    elif cmd[0] == 'size':
        m_q.size()
    elif cmd[0] == 'empty':
        m_q.empty()
    elif cmd[0] == 'front':
        m_q.front()
    elif cmd[0] == 'back':
        m_q.back()
    else:
        continue
