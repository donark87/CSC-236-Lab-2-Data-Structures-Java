//Donark Patel
//CSC-236
//Lab 2A
//Application: lock

public class Lock implements LockADT
{
	private int xCombo;
	private int yCombo;
	private int zCombo;
	private int top = 0;
	public static boolean locked = false;

	public Lock()
	{
		xCombo = 1;
		yCombo = 2;
		zCombo = 3;
	}

	public void alter(int x, int y, int z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	public void setX(int x)
	{
		xCombo = x;
	}
	public void setY(int y)
	{
		yCombo = y;
	}
	public void setZ(int z)
	{
		zCombo = z;
	}
	public boolean turn(int lockNumber, int combinationNumber)
	{
		if(combinationNumber == 1)
		{
			int counter = 0;

			for(int i = 0; i >= 0; i --)
			{
				top = i;
				System.out.print(" " + top + " ");

				if(top == lockNumber)
					counter ++;

				if(counter == 2 && top == lockNumber)
				{
					if(top == xCombo)
					{
						System.out.println("\n\n");
						return true;
					}
					else
						return false;
				}
				if(top == 0)
					i = 40;

			}
		}

		else if(combinationNumber == 2)
		{
			int counter = 0;

			for(int i = top; i <= 39; i++)
			{
				top = i;
				System.out.print(" " + top + " ");

				if(top == lockNumber)
					counter++;

				if(counter == 2 && top == lockNumber)
				{
					if(top == yCombo)
					{
						System.out.println("\n\n");
						return true;
					}
					else
						return false;
				}

				if(top == 39)
					i = -1;
			}
		}

		else if(combinationNumber == 3)
		{
			int counter = 0;

			for(int i = top; i >= 0; i--)
			{
				top = i;
				System.out.print(" " + top + " ");

				if(top == lockNumber)
				{
					if(top == zCombo)
					{
						System.out.println("\n\n");
						return true;
					}
					else
						return false;
				}
				if(top == 0)
					i = 40;
			}
		}

		else
			return false;

		return false;
	}

	public void close()
	{
		locked = true;
	}

	public void attempt(int x, int y, int z)
	{
		boolean xTest = false;
		boolean yTest = false;
		boolean zTest = false;

		xTest = turn(x, 1);
		System.out.println();

		yTest = turn(y, 2);
		System.out.println();

		zTest = turn(z, 3);
		System.out.println();

		if(xTest == true && yTest == true && zTest == true)
		{
			locked = false;
			System.out.println("Lock status: OPEN!");
			System.out.println(this);
		}
		else
			System.out.println("Lock status: CLOSED!");
	}

	public boolean inquire(boolean locked)
	{
		if(locked == true)
		{
			System.out.println("Lock status: LOCKED!");
                        return true;
		}
		else
		{
			System.out.println("Lock status: UN-LOCKED!");
                        return false;
		}
	}

	public int currently()
	{
		return top;
	}
}