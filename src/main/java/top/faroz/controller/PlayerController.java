package top.faroz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.faroz.pojo.Player;
import top.faroz.resp.CommonResp;
import top.faroz.service.PlayerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PlayerController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午7:47
 * @Version 1.0
 **/
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Resource
    private PlayerService playerService;

    @RequestMapping("/list")
    public CommonResp list() {
        List<Player> players = playerService.selectAll();
        CommonResp commonResp = new CommonResp();
        commonResp.setContent(players);
        return commonResp;
    }

}
