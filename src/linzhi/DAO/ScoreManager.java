package linzhi.DAO;

import linzhi.bean.Score;

import java.util.List;

/**
 * Created by wanglinzhizhi on 15-4-9.
 */
public interface ScoreManager {

    public List<Score> listAllScore(String email);
}
