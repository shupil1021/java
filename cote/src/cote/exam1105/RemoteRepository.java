package cote.exam1105;

public class RemoteRepository implements MemoRepository{
	@Override
	public void addMemo(String id, String body) {};
	@Override
	public void getMemo() {};
	@Override
	public void updateMemo(String id, String body) {};
	@Override
	public void deleteMemo(String id) {};
}
