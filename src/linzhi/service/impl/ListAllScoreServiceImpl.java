package linzhi.service.impl;

import linzhi.DAO.ScoreManager;
import linzhi.DAO.impl.ScoreManagerImpl;
import linzhi.bean.Score;
import linzhi.service.ListAllScoreService;

import java.util.List;

/**
 * Created by wanglinzhizhi on 15-4-8.
 */
public class ListAllScoreServiceImpl implements ListAllScoreService {
    @Override
    public List<Score> listAllScore(String email) {
        ScoreManager scoreManager=new ScoreManagerImpl();


        return scoreManager.listAllScore(email);

    }
}
