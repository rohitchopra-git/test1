def call()
{
  sh"date"
  sh"ifconfig"
}

def add()
{
  sh"echo hello from add of shared library"
}
