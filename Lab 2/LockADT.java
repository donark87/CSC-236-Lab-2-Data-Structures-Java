//Donark Patel
//CSC-236
//Lab 2A
//Application: lock

public interface LockADT
{
public boolean turn(int lockNumber, int combinationNumber);

	public void close();
	public void attempt(int x, int y, int z);
	public boolean inquire(boolean locked);
	public int currently();

}