export default {
    install(Vue) {
        Vue.prototype.$risks = [
            {index: 1, code: 'OR111', detail: '运动员的身高不占优势'},
            {index: 2, code: 'OR112', detail: '运动员的身高、体重比例不占优势'},
            {index: 3, code: 'OR121', detail: '运动员的先天肢体协调性较差'},
            {index: 4, code: 'OR131', detail: '运动员的生理机能较他人更易损伤'},
            {index: 5, code: 'OR132', detail: '运动员的心肺功能相关指标不占优势'},
            {index: 6, code: 'OR141', detail: '运动员的抗压能力差，不能及时地自我调节'},
            {index: 7, code: 'OR142', detail: '运动员的训练欲望不强'},
            {index: 8, code: 'OR143', detail: '运动员的训练情绪不稳定'},
            {index: 9, code: 'OR211', detail: '运动员的身体素质结构发展不符合项目特征'},
            {index: 10, code: 'OR212', detail: '运动员的专项身体素质较差'},
            {index: 11, code: 'OR221', detail: '运动员的技术不稳定'},
            // {index: 12, code: 'OR222', detail: '运动员的技术个性特征不显著，没有“绝杀”技术'},
            {index: 13, code: 'OR223', detail: '运动员有明显的、不可弥补的技术缺陷'},
            {index: 14, code: 'OR231', detail: '运动员对对手的战术应变能力不强'},
            {index: 15, code: 'OR232', detail: '运动员对战术制定及战术训练没有良好地针对意识'},
            {index: 16, code: 'OR233', detail: '运动员的战术单一'},
            // {index: 17, code: 'OR241', detail: '运动员不能较好地掌握相关理论与知识'},
            {index: 18, code: 'OR242', detail: '运动员不能主动学习理论知识'},
            {index: 19, code: 'OR251', detail: '运动员旧伤积累不得痊愈'},
            {index: 20, code: 'OR252', detail: '运动员因意外事故造成损伤'},
            // {index: 21, code: 'OR261', detail: '运动员没有正确的道德观念'},
            // {index: 22, code: 'OR262', detail: '运动员缺乏爱国主义精神'},
            {index: 23, code: 'OR263', detail: '运动员不能较好的践行体育道德'},
            {index: 24, code: 'OR264', detail: '运动员追求目标不明确'},
            {index: 25, code: 'OR265', detail: '运动员缺少追求卓越的信念'},
            {index: 26, code: 'OR271', detail: '运动员独立自主能力较差'},
            {index: 27, code: 'OR272', detail: '运动员不能较好地管理自己的言行'},
            {index: 28, code: 'OR281', detail: '运动员的赛练比例失调导致比赛经验不足'},
            {index: 29, code: 'SR111', detail: '社会大众对网球文化不认同'},
            {index: 30, code: 'SR121', detail: '网球文化传播渠道狭窄'},
            {index: 31, code: 'SR211', detail: '运动员选拔指标不科学'},
            {index: 32, code: 'SR212', detail: '运动员参加外训的机会不公平'},
            {index: 33, code: 'SR213', detail: '运动员参赛管理制度不符合职业网球需求'},
            {index: 34, code: 'SR214', detail: '有无编制使运动员待遇差距较大'},
            {index: 35, code: 'SR221', detail: '运动员升学问题得不到良好解决'},
            {index: 36, code: 'SR222', detail: '运动员学、训问题得不到良好处理'},
            {index: 37, code: 'SR231', detail: '教练员绩效考核指标不科学'},
            {index: 38, code: 'SR232', detail: '教练员考核方式单一'},
            {index: 39, code: 'SR233', detail: '有无编制使教练员待遇差距较大'},
            {index: 40, code: 'SR241', detail: '硬件设施得不到有效利用'},
            {index: 41, code: 'SR242', detail: '场地与器材的维护滞后'},
            {index: 42, code: 'SR311', detail: '经费不能满足运动员的赛、练需求'},
            {index: 43, code: 'SR312', detail: '经费的分配不合理'},
            {index: 44, code: 'SR321', detail: '高科技技术与设备匮乏'},
            {index: 45, code: 'SR322', detail: '高科技技术与设备得不到善用'},
            {index: 46, code: 'SR331', detail: '场地与器材不能满足运动员需求'},
            {index: 47, code: 'SR341', detail: '运动员的医疗保障不得力'},
            {index: 48, code: 'SR411', detail: '训练计划的制定不科学，有给运动员带来损伤的潜在危险'},
            // {index: 49, code: 'SR412', detail: '教练员沟通能力不足'},
            {index: 50, code: 'SR413', detail: '教练员专项知识储备较少，不能理论指导实践'},
            {index: 51, code: 'SR414', detail: '训练计划不能够体现运动员个性特征和较强的针对性，不利于运动员竞技能力的提升'},
            {index: 52, code: 'SR415', detail: '教练员没有较强的事业心和责任心'},
            {index: 53, code: 'SR416', detail: '教练员对运动员的行为没有约束或及时监管'},
            {index: 54, code: 'SR417', detail: '教练员对运动员长远发展的宏观把控力不强'},
            {index: 55, code: 'SR418', detail: '教练员没有较强的职业道德水平'},
            {index: 56, code: 'SR421', detail: '家长（监护人）对运动员期望过高造成运动员心理负担加重'},
            {index: 57, code: 'SR422', detail: '家长（监护人）对运动员的赛、练不支持、不在意'},
            {index: 58, code: 'SR431', detail: '运动员与教练员关系处理不当'},
            {index: 59, code: 'SR432', detail: '运动员与资助方关系处理不当'}
        ];

        Vue.prototype.$selectItems = [
            {
                type: "possibility",
                selections: [
                    {score: 1, detail: '根本不可能'},
                    {score: 2, detail: '很少有可能'},
                    {score: 3, detail: '不太有可能'},
                    {score: 4, detail: '比较有可能'},
                    {score: 5, detail: '非常有可能'}
                ]
            },
            {
                type: "severity",
                selections: [
                    {score: 1, detail: '没有影响'},
                    {score: 2, detail: '不严重'},
                    {score: 3, detail: '不太严重'},
                    {score: 4, detail: '比较严重'},
                    {score: 5, detail: '非常严重'},
                ]
            },
            {
                type: "controllability",
                selections: [
                    {score: 1, detail: '很容易控制'},
                    {score: 2, detail: '较易控制'},
                    {score: 3, detail: '控制有难度'},
                    {score: 4, detail: '控制难度很大'},
                    {score: 5, detail: '不能控制'},
                ]
            }
        ];

        Vue.prototype.$riskCodes = [
            'OR111',
            'OR112',
            'OR121',
            'OR131',
            'OR132',
            'OR141',
            'OR142',
            'OR143',
            'OR211',
            'OR212',
            'OR221',
            'OR222',
            'OR223',
            'OR231',
            'OR232',
            'OR233',
            'OR241',
            'OR242',
            'OR251',
            'OR252',
            'OR261',
            'OR262',
            'OR263',
            'OR264',
            'OR265',
            'OR271',
            'OR272',
            'OR281',
            'SR111',
            'SR121',
            'SR211',
            'SR212',
            'SR213',
            'SR214',
            'SR221',
            'SR222',
            'SR231',
            'SR232',
            'SR233',
            'SR241',
            'SR242',
            'SR311',
            'SR312',
            'SR321',
            'SR322',
            'SR331',
            'SR341',
            'SR411',
            'SR412',
            'SR413',
            'SR414',
            'SR415',
            'SR416',
            'SR417',
            'SR418',
            'SR421',
            'SR422',
            'SR431',
            'SR432',
        ];
    }
}