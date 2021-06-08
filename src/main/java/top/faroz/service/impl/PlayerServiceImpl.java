package top.faroz.service.impl;

import org.springframework.stereotype.Service;
import top.faroz.mapper.PlayerMapper;
import top.faroz.pojo.Player;
import top.faroz.service.PlayerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PlayerServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午7:48
 * @Version 1.0
 **/
@Service
public class PlayerServiceImpl implements PlayerService {

    @Resource
    private PlayerMapper playerMapper;

    @Override
    public List<Player> selectAll() {
        List<Player> players = playerMapper.selectByExample(null);
        return players;
    }
}
