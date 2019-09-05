//
//  ViewController.swift
//  KotlinIOS
//
//  Created by Esraa Ibrahim on 9/5/19.
//  Copyright © 2019 Esraa Ibrahim. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = CommonKt.createApplicationScreenMessage()
        view.addSubview(label)
    }

}

