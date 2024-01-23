def tous(m):
  for n in range(10 ** 4):
    if n % 13 == 0 and n % 100 == 15:
      print(n)

# problem 15
# print(tous(13))
# problem 16
# print(tous(15))

# problem 17
def sev():
  for n in range(10, 100):
    if n == 7 * int(str(n)[1:]):
      print(n)

# print(sev())


def fisev(m):
  for n in range(10, 1000000):
    if n == m * int(str(n)[1:]):
      print(n)

# problem 19
# print(fisev(57))
# problem 20
# print(fisev(37))
# problem 21
# print(fisev(58))

def dwadwa(a, b, c):
  if (a ** 3) + (b ** 3) == (c ** 3):
    return True
  else:
    return False


def dwadwa():
  for n in range(1,1000):
    if (n ** 3) + (n ** 3) == ((n + n) ** 3):
      print(n)


print(dwadwa())
