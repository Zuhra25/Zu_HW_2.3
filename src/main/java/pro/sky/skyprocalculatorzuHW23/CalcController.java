package pro.sky.skyprocalculatorzuHW23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService CalcService;

    public CalcController(CalcService CalcService) {
        this.CalcService = CalcService;
    }

    @GetMapping()
    public String hello() {
        return CalcService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer arg1, @RequestParam("num2") Integer arg2) {
        return String.format("%d + %d = %d", arg1, arg2, CalcService.plus(arg1, arg2));

    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int arg1, @RequestParam("num2") int arg2) {
        return String.format("%d - %d = %d", arg1, arg2, CalcService.minus(arg1, arg2));
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int arg1, @RequestParam("num2") int arg2) {
        return String.format("%d * %d = %d", arg1, arg2, CalcService.multiply(arg1, arg2));
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int arg1, @RequestParam("num2") int arg2) {
        if (arg2 == 0) {
            return String.format("Делить на ноль нельзя!!!");
        } else {
            return String.format("%d / %d = %.1f", arg1, arg2, CalcService.divide(arg1, arg2));
        }

    }
}
